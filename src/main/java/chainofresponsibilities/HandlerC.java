package chainofresponsibilities;

public class HandlerC extends BaseHandler{
    @Override
    public void handle(Integer requst) {
        if(requst%5==0){
            System.out.println("dividable by 5");
            super.handle(requst);
        }

    }
}
