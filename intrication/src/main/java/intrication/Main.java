package intrication;

import org.redfx.strange.Program;
import org.redfx.strange.QuantumExecutionEnvironment;
import org.redfx.strange.local.SimpleQuantumExecutionEnvironment;
import org.redfx.strangefx.render.Renderer;


public class Main {
    public static void main(String[] args) {

        final var program = intricationProgram();
        QuantumExecutionEnvironment environment =
                new SimpleQuantumExecutionEnvironment();

        environment.runProgram(program);
        Renderer.renderProgram(program);
        Renderer.showProbabilities(program, 1000);
    }

    public static Program intricationProgram() {
        var program =  new Program(2);
        // to be filled in live
        return program;
    }
}
