package BID.SWE;

import java.util.Arrays;

public class Exercise3Impl implements Exercise3
{


    public abstract class Method1 extends extends Map{

    }

    public abstract class Bewegung {
        public void Position() {};
        public void   Move(int x){};
    }

    public class Springen extends Bewegung {
        public  void Position(){};

    }

    public class Laufen extends Bewegung {
        public  void Position(){};

    }

    @Override
    public Object Method1() {
        return null;
    }

    @Override
    public Object Method2() {
        return Arrays.asList(new Springen(), new Laufen());
    }
}
