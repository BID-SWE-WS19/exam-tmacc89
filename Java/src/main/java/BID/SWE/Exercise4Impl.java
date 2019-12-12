package BID.SWE;

import javax.imageio.IIOException;
import java.io.*;

public class Exercise4Impl implements Exercise4
{

    @Override
    public Object Method1() {
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        DataOutputStream d = new DataOutputStream(b);

        try{
            d.writeUTF("Frohe Weihnachten");
            d.writeInt(42);
            d.writeBoolean(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ByteArrayInputStream(b.toByteArray());
    }

    @Override
    public Object Method2(Object o) {
        InputStream s = (InputStream) o;
        DataInputStream di = new DataInputStream(s);
        try {
            di.readInt();
            di.readBoolean();
            return di.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
