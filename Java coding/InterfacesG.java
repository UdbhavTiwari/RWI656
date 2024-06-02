interface Payment {
    void pay(double amount);
    void cancelPayment();
    boolean paymentStatus();
}


class CreditCardPayment implements Payment {
    private boolean paid = false;
    
    @Override
    public void pay(double amount) {
        // Logic for credit card payment
        System.out.println("Paid " + amount + " using Credit Card.");
        paid = true;
    }
    
    @Override
    public void cancelPayment() {
        // Logic for cancelling credit card payment
        System.out.println("Credit Card payment cancelled.");
        paid = false;
    }
    
    @Override
    public boolean paymentStatus() {
        return paid;
    }
}

class PayPalPayment implements Payment {
    private boolean paid = false;
    
    @Override
    public void pay(double amount) {
        // Logic for PayPal payment
        System.out.println("Paid " + amount + " using PayPal.");
        paid = true;
    }
    
    @Override
    public void cancelPayment() {
        // Logic for cancelling PayPal payment
        System.out.println("PayPal payment cancelled.");
        paid = false;
    }
    
    @Override
    public boolean paymentStatus() {
        return paid;
    }
}

class BankTransferPayment implements Payment {
    private boolean paid = false;
    
    @Override
    public void pay(double amount) {
        // Logic for bank transfer payment
        System.out.println("Paid " + amount + " using Bank Transfer.");
        paid = true;
    }
    
    @Override
    public void cancelPayment() {
        // Logic for cancelling bank transfer payment
        System.out.println("Bank Transfer payment cancelled.");
        paid = false;
    }
    
    @Override
    public boolean paymentStatus() {
        return paid;
    }
}



public class InterfacesG {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment paypal = new PayPalPayment();
        Payment bankTransfer = new BankTransferPayment();
        
        creditCard.pay(100.0);
        System.out.println("Credit Card Payment Status: " + creditCard.paymentStatus());
        
        paypal.pay(200.0);
        System.out.println("PayPal Payment Status: " + paypal.paymentStatus());
        
        bankTransfer.pay(300.0);
        System.out.println("Bank Transfer Payment Status: " + bankTransfer.paymentStatus());
        
        creditCard.cancelPayment();
        System.out.println("Credit Card Payment Status after cancel: " + creditCard.paymentStatus());
    }
}
