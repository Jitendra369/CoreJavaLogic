package designpattern.core;

public class Chain {
    Processor chain;

//  call at the time of creation of object
    public Chain(){
        buildChain();
    }

    private void buildChain(){
        chain = new NegativeProcessor(new ZeroProcess(new PositiveProcess(null)));
    }

    public void process(Number request){  //90
        chain.process(request);
    }

}
