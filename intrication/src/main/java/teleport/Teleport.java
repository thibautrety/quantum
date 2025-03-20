package teleport;

import org.redfx.strange.Program;
import org.redfx.strange.Step;
import org.redfx.strange.gate.Cnot;
import org.redfx.strange.gate.Cz;
import org.redfx.strange.gate.Hadamard;
import org.redfx.strange.gate.Measurement;

public class Teleport {

    private static Program teleportProgram() {
        Program program = new Program(3);
        Step step1 = new Step();
        step1.addGate(new Hadamard(1));
        Step step2 = new Step();
        step2.addGate(new Cnot(1,2));
        Step step3 = new Step();
        step3.addGate(new Cnot(0,1));
        Step step4 = new Step();
        step4.addGate(new Hadamard(0));
        Step step5 = new Step();
        step5.addGate(new Measurement(0));
        step5.addGate(new Measurement(1));
        Step step6 = new Step();
        step6.addGate(new Cnot(1,2));
        Step step7 = new Step();
        step7.addGate(new Cz(0,2));
        program.addStep(step1);
        program.addStep(step2);
        program.addStep(step3);
        program.addStep(step4);
        program.addStep(step5);
        program.addStep(step6);
        return program;
    }


}
