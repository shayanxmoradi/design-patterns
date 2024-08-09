package chainofresponsibilities.simplee;

public class HandlerB extends BaseHandler {

    @Override
    public void handle(Integer requst) {
        if(requst%2==0){
            System.out.println("its even");
            super.handle(requst);
        }

    }
}
