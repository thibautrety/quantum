package teleport;

import org.redfx.strange.Program;
import org.redfx.strange.QuantumExecutionEnvironment;
import org.redfx.strange.Step;
import org.redfx.strange.gate.Cnot;
import org.redfx.strange.gate.Cz;
import org.redfx.strange.gate.Hadamard;
import org.redfx.strange.gate.Measurement;
import org.redfx.strange.local.SimpleQuantumExecutionEnvironment;
import org.redfx.strangefx.render.Renderer;

public class Main {

    public static void main(String[] args) {
        QuantumExecutionEnvironment simulator = new SimpleQuantumExecutionEnvironment();
        final var program = teleportProgram();
        program.initializeQubit(0, getAlpha(0.8));
        simulator.runProgram(program);
        Renderer.renderProgram(program);
        Renderer.showProbabilities(program, 1000);
    }

    private static Program teleportProgram() {
        Program program = new Program(3);
        // to be filled in live
        return program;
    }

    private static double getAlpha(double probaOfOne) {
        return Math.sqrt(1-probaOfOne);
    }

}
