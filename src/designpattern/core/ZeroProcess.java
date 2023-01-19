package designpattern.core;

public class ZeroProcess extends  Processor{

    public ZeroProcess(Processor nextProcessor) {
        super(nextProcessor);
    }
    public void process(Number request){
        if (request.getNumber() == 0){
            System.out.println("zero process "+ request.getNumber());
        }else{
            super.process(request);
        }
    }
}
