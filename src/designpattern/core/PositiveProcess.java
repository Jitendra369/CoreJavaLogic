package designpattern.core;

public class PositiveProcess extends  Processor{

    public PositiveProcess(Processor nextProcessor) {
        super(nextProcessor);
    }
     public  void process(Number request){
        if (request.getNumber() >0){
            System.out.println("positive process "+ request.getNumber());
        }else{
            super.process(request);
        }
     }
}
