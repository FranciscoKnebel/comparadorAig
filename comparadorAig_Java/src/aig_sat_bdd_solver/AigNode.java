package aig_sat_bdd_solver;

/**
 * @author luciano/rodrigo
 */

public class AigNode {
    int input1;
    int input2;
    int output;
    String equacao;
    
    public AigNode(int input1, int input2, int output){
        this.input1 = input1;
        this.input2 = input2;
        this.output = output;
    }
    
    @Override
    public String toString(){
        return "Input1: "+input1+" Input2: "+input2+" Output: "+output + " Equacao: " + equacao;
    }

}
