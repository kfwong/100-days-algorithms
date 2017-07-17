package Day007_BinaryAdditionFiniteStateAutomata
/*
fun main(args: Array<String>) {
    var s: State = States.Init
    var input: Input = Input("aabbbc"); // valid
    //var input: Input = Input("acbabc"); //invalid

    while(!s.equals(States.End)  &&  !s.equals(States.Fail)){
        println("OMG: ${s}")
        s = s.next(input)
    }

    if (s == States.End) {
        println("Valid!");
    } else {
        println("Failed");
    }
}

interface State {
    fun next(input: Input): State
}

class Input constructor(input: String) {
    var input: String
    var current: Int

    init {
        this.input = input
        this.current = 0
    }

    fun read(): Char {
        if (current >= input.length()) {
            return '0'
        } else {
            return input.charAt(current++)
        }
    }
}

enum class States : State {
    Init {
        override fun next(input: Input): State {
            val curr = input.read()

            if (curr == 'a') return A
            else return Fail
        }
    },

    A {
        override fun next(input: Input): State {
            val curr = input.read()

            if (curr == 'a') return A
            if (curr == 'b') return B
            if (curr == 'c') return C
            if (curr == '0') return End
            else return Fail
        }
    },

    B {
        override fun next(input: Input): State {
            val curr = input.read()

            if (curr == 'b') return B
            if (curr == 'c') return C
            if (curr == '0') return End
            else return Fail
        }
    },

    C {
        override fun next(input: Input): State {
            val curr = input.read()

            if (curr == 'c') return C
            if (curr == '0') return End
            else return Fail
        }
    },

    Fail {
        override fun next(input: Input): State {
            return Fail
        }
    },

    End {
        override fun next(input: Input): State {
            return End
        }
    };

    override public abstract fun next(input: Input): State
}
*/