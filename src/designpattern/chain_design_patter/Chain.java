package designpattern.chain_design_patter;

public interface Chain {

    // here, we send the object that implement the chain interface
    public void setNextChain(Chain chain);

//  calculation done by perticular chain
    public void calculate(Numbers number);
}
