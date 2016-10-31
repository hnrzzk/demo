package algorithm;

/**
 * Created by zhangkai on 16-10-31.
 */
public class ProxyAlgorithm implements Algorithm {

    Algorithm algorithm;

    public ProxyAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void run() {
        long starTime=System.currentTimeMillis();
        algorithm.run();
        long endTime=System.currentTimeMillis();
        System.out.println(String.format("运行时间：%s ms",endTime-starTime));
    }
}