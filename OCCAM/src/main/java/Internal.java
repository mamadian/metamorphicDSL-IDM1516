import org.jcsp.lang.*;
import org.jcsp.plugNplay.ints.ParaplexInt;

class Internal {

    public static void main(String[] args) {

        final One2OneChannelInt[] a = Channel.one2oneIntArray(1);
        final One2OneChannel b = Channel.one2one();

        new Parallel(
            new CSProcess[]{
                new CSProcess() {
                    public void run() {
                        a[0].out().write(1);
                        System.out.println("send value : " + 1);
                    }
                },
                new CSProcess() {
                    public void run() {
                        int[] data = (int[]) b.in().read();
                        System.out.println("get value : " + data[0]);
                    }
                },
                new ParaplexInt(Channel.getInputArray(a), b.out())
            }
        ).run();
    }
}