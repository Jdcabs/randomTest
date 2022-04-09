public class operator_Selection {

    //variables.
    //properties.
    private char operator;
    private int first_Num;
    private int second_Num;
    private int sum;


    //Empty Constructor.
    operator_Selection(){ }


    //Setters.
    public void setOperator(char operator) { this.operator = operator; }
    public void setFirst_Num(int first_Num) { this.first_Num = first_Num; }
    public void setSecond_Num(int second_Num) { this.second_Num = second_Num; }
    public void setSum(int sum){ this.sum = sum; };

    //Getters
    public char getOperator() { return operator; }
    public int getFirst_Num() { return first_Num; }
    public int getSecond_Num() { return second_Num; }
    public int getSum(){ return sum; };


     void see_Result(){
        if (getOperator() == '+') {
            int summ = getFirst_Num() + getSecond_Num();
            setSum(summ);
            System.out.println("\n" + getFirst_Num() + " + " + getSecond_Num() + " = " + getSum());
        }else if (getOperator() == '-'){
            int summ = getSecond_Num() - getFirst_Num();
            setSum(summ);
            System.out.println("\n" + getFirst_Num() + " - " + getSecond_Num() + " = " + getSum());
        }else if(getOperator() == '*'){
            int summ = getFirst_Num() * getSecond_Num();
            setSum(summ);
            System.out.println("\n" + getFirst_Num() + " * " + getSecond_Num() + " = " + getSum());
         }
    }
}
