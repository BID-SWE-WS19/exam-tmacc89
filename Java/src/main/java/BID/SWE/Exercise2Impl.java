package BID.SWE;

import com.sun.source.tree.BreakTree;

import java.lang.reflect.Method;

public class Exercise2Impl implements Exercise2
{
    @Override
    public Object Method1() {
        return new Method1();
    }

    @Override
    public int Method2() {
        return new Method2().Grow();
    }

    @Override
    public boolean Method3(int i) {
        return new Method3().IsAlive();
    }

    public class Method1 extends Cell{
    }


    public class Method2 extends Cell {
        @Override
        public int Grow(){
            this._size = _size *2;

            return _size;
        }
    }


    public class  Method3 extends Cell {
        @Override
        public boolean IsAlive() {
            return true;
        }
    }
}
