package designpattern.core;

public class NegativeProcessor  extends  Processor{

//    calling to superclass constructor first
    public NegativeProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }
    public void process(Number request){
        if (request.getNumber() < 0){
            System.out.println("negavtive processor :" + request.getNumber());
        }
        else{
            super.process(request);
        }
    }
}
