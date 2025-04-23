public class OneTimeExpense extends Item{

    @Override
    public void set_amount(int val){
        if (val > 0){
            amount = val;
        }
    }
}