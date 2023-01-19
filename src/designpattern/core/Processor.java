package designpattern.core;
//chain design pattern

abstract class Processor {
    private Processor nextProcessor;

//    constructor class, pass the new instance of implmented class
    public Processor(Processor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void process(Number request){
        if( nextProcessor!=null){
            nextProcessor.process(request);
        }
    }
}
