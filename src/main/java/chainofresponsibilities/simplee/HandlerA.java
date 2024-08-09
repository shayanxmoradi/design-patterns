package chainofresponsibilities.simplee;

public class HandlerA extends BaseHandler {
    @Override
    public void handle(Integer requst) {
        if(requst>0){
            System.out.println("its positive");
            super.handle(requst);
        }

    }
}
