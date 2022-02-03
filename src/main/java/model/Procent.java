package model;

public class Procent {

    public double countPr(double sum, int pr){
        return(double)(sum/100*pr);
    }

    public double countSum(double sum, int pr){
        return(double)(sum+countPr(sum, pr));

    }

    public int countSumTrunc(double sum, int pr){
        return Math.round((float) countSum(sum, pr));
    }
}
