package Day007_BinaryAdditionFiniteStateAutomata

fun main(args: Array<String>) {
    var s: State = States.Init
    var input: Input = Input(
            "1100100100100",
            "0100100011000")

    while (!s.equals(States.End) && !s.equals(States.Invalid)) {
        s = s.next(input)
    }

    if (s == States.End) {
        println("End")
    } else {
        println("Invalid")
    }
}

class Input constructor(a: String, b: String) {
    var p: Pair<String, String>
    var current: Int
    var result: String

    init {
        this.p = Pair(a.reverse(), b.reverse())
        this.current = 0
        this.result = ""
    }

    fun read(): Pair<Char, Char> {
        if (current >= p.first.length() || current >= p.second.length()) {
            return Pair('X', 'X')
        } else {
            var result = Pair(p.first.charAt(current), p.second.charAt(current))
            current++
            return result
        }
    }
}

interface State {
    fun next(input: Input): State
}

enum class States : State {
    Init {
        override fun next(input: Input): State {
            return Carry0
        }
    },
    Carry0 {
        override fun next(input: Input): State {
            val curr = input.read()

            if (curr.first == '0' && curr.second == '0') {
                input.result += 0
                return Carry0
            }

            if (curr.first == '0' && curr.second == '1' || curr.first == '1' && curr.second == '0') {
                input.result += 1
                return Carry0
            }

            if (curr.first == '1' && curr.second == '1') {
                input.result += 0
                return Carry1
            }

            if (curr.first == 'X' && curr.second == 'X') {
                println(input.result.reverse())
                return End
            }

            return Invalid
        }
    },
    Carry1 {
        override fun next(input: Input): State {
            val curr = input.read()

            if (curr.first == '0' && curr.second == '0') {
                input.result += 1
                return Carry0
            }

            if (curr.first == '0' && curr.second == '1' || curr.first == '1' && curr.second == '0') {
                input.result += 0
                return Carry1
            }

            if (curr.first == '1' && curr.second == '1') {
                input.result += 1
                return Carry1
            }

            if (curr.first == 'X' && curr.second == 'X') {
                input.result += 1
                println(input.result.reverse())
                return End
            }

            return Invalid
        }
    },
    End {
        override fun next(input: Input): State {
            return End
        }
    },
    Invalid {
        override fun next(input: Input): State {
            return Invalid
        }
    };
}