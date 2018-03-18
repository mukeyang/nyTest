import io.netty.channel.nio.NioEventLoopGroup;

/**
 * Created by CS on 2018/1/28.
 */
public class n1 {
}

class EchoServer {
    private final int port;

    public EchoServer(int port) {
        this.port = port;
    }

    public void start() {
        NioEventLoopGroup group = new NioEventLoopGroup();

    }
}