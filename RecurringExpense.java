
public class RecurringExpense extends Item{
    int freq;

    @Override
    public void set_amount(int val){
        if (val > 0){
            amount = val;
        }
    }
}