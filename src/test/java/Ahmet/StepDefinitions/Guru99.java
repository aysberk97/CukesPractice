package Ahmet.StepDefinitions;

import Ahmet.pages.Guru99Page;
import Ahmet.pages.GuruPage2;
import Ahmet.pages.GuruPage3;
import Ahmet.pages.GuruPage4;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class Guru99 {

    @Given("As a user I want Go to Guru99 Demo Site")
    public void as_a_user_i_want_go_to_guru99_demo_site() {
        System.out.println("We are in GUru99 page Thanks to Hook class");

    }
    @When("the user wants to check text {string} is present")
    public void the_user_wants_to_check_text_is_present(String str1) {
        Guru99Page guru99Page = new Guru99Page();
        guru99Page.setVrfyTitle1(str1);

    }
    @Then("the user wants Login into application with given credentials")
    public void the_user_wants_login_into_application_with_given_credentials() {
        Guru99Page guru99Page = new Guru99Page();
        guru99Page.setUserrnameBox();
        guru99Page.setPassrwordBox();
        guru99Page.setLoginbuttonBox();


    }
    @Then("the user wants Verify that the Home page contains text as {string}")
    public void the_user_wants_verify_that_the_home_page_contains_text_as(String str2) {

        GuruPage2 guruPage2 = new GuruPage2();
        guruPage2.setAddNewCstmr();

    }
    @Then("the user wants Click on new customer button and verify you are in New Customer Entry Page")
    public void the_user_wants_click_on_new_customer_button_and_verify_you_are_in_new_customer_entry_page() {
        GuruPage2 guruPage2 = new GuruPage2();
        guruPage2.setNewcstmrVrfy();


    }
    @Then("the user wants Fill the information for new customer")
    public void the_user_wants_fill_the_information_for_new_customer(List<List <String>>  dataTable) {
        GuruPage3 guruPage3 = new GuruPage3();
        guruPage3.setName(dataTable.get(1).get(0));
        guruPage3.setMale();
        guruPage3.setDob(dataTable.get(1).get(2));
        guruPage3.setAdress(dataTable.get(1).get(3));
        guruPage3.setCity(dataTable.get(1).get(4));
        guruPage3.setState(dataTable.get(1).get(5));
        guruPage3.setPinno(dataTable.get(1).get(6));
        guruPage3.setTelno(dataTable.get(1).get(7));
        guruPage3.setEmail(dataTable.get(1).get(8));
        guruPage3.setPassword(dataTable.get(1).get(9));
        guruPage3.setSubmit();



    }
    @Then("the user wants Verify new customer added successfully")
    public void the_user_wants_verify_new_customer_added_successfully() {

        GuruPage4 guruPage4 = new GuruPage4();
        guruPage4.setVerifycation();

    }
}
