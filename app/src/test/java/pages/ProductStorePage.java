package pages;

import org.junit.Assert;

public class ProductStorePage extends BasePage{

    private String signUp = "/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[8]/a[1]";
    private String signUsername = "//input[@id='sign-username']";
    private String signPassword = "//input[@id='sign-password']";
    private String signUpButton = "//button[contains(text(),'Sign up')]";
    private String signUpCloseButton = "//body/div[@id='signInModal']/div[1]/div[1]/div[3]/button[1]";

    private String logIn = "/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[5]/a[1]";
    private String logInUsername = "//input[@id='loginusername']";
    private String logInPassword = "//input[@id='loginpassword']";
    private String logInButton = "//button[contains(text(),'Log in')]";
    private String logInCloseButton = "//body/div[@id='logInModal']/div[1]/div[1]/div[3]/button[1]";
    private String laptopSony = "//a[contains(text(),'Sony vaio i5')]";
    private String addToCartButton = "//a[contains(text(),'Add to cart')]";
    private String cart = "//a[@id='cartur']";
    private String logOut = "/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[6]/a[1]";

    public ProductStorePage(){
        super(driver);
    }

    public void navigateToProductStore(){
        navigateTo("https://www.demoblaze.com");
    }

    public void clickSignUp(){
        clickElement(signUp);
    }

    public void clickLogIn(){
        clickElement(logIn);
    }

    public void clickLogOut(){
        clickElement(logOut);
    }

    public void clickCart(){
        clickElement(cart);
    }

    public void enterSignUsername(String username){
        write(signUsername, username);
    }

    public void enterSignPassword(String password){
        write(signPassword, password);
    }

    public void clickSignUpButton(){
        clickElement(signUpButton);
    }
    
    public void clickSignUpCloseButton(){
        clickElement(signUpCloseButton);
    }

    public void enterLogInUsername(String username){
        write(logInUsername, username);
    }

    public void enterLogInPassword(String password){
        write(logInPassword, password);
    }

    public void clickLogInButton(){
        clickElement(logInButton);
    }
    
    public void clickLogInCloseButton(){
        clickElement(logInCloseButton);
    }

    public void aceptAlert(){
        aceptAlert();
    }

    public void clickInLaptop(){
        clickElement(laptopSony);
    }

    public void addToCartButton(){
        clickElement(addToCartButton);
    }

    public void validateText(String locator, String textToValidate){
        Assert.assertEquals(textToValidate, locator);
    }
}

