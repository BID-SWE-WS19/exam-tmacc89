package BID.SWE;

import java.util.Date;

public class Exercise1Impl implements CellPrinter
{
    @Override
    public String PrintStateBool(boolean var1, Date var2, String var3) {

        String answer;

        if (var1) {
            answer = "alive = wahr" + " date =" + var2 + " color= " + var3;
            return answer;
        }
        else return "not alive";
    }

    @Override
    public String PrintPosition(int var1, int var2){
        String answer;

        answer= "Cell is on Position X:" + var1 + "Y:" + var2;
        return answer;
    }
}


