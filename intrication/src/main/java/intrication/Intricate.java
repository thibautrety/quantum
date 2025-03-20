package intrication;

import org.redfx.strange.Program;
import org.redfx.strange.Step;
import org.redfx.strange.gate.Cnot;
import org.redfx.strange.gate.Hadamard;

public class Intricate {

    public static Program intricationProgram() {
        var program = new Program(2);
        // step 0
        final var step0 = new Step();
        var hadamard = new Hadamard(0);
        step0.addGate(hadamard);
        program.addStep(step0);

        // step 1
        final var step1 = new Step();
        var cnot = new Cnot(0,1);
        step1.addGate(cnot);
        program.addStep(step1);
        return program;
    }

}
