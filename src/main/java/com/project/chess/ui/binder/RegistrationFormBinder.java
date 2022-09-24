package com.project.chess.ui.binder;

import com.project.chess.data.utils.UserDetails;
import com.project.chess.ui.form.RegistrationForm;
import com.project.chess.ui.layout.MainLayout;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.ValidationException;
import com.vaadin.flow.data.binder.ValidationResult;
import com.vaadin.flow.data.binder.ValueContext;

public class RegistrationFormBinder {

   private final RegistrationForm registrationForm;

   /**
    * Flag for disabling first run for password validation
    */
   private boolean enablePasswordValidation;

   public RegistrationFormBinder(RegistrationForm registrationForm) {
       this.registrationForm = registrationForm;
   }

   /**
    * Method to add the data binding and validation logics
    * to the registration form
    */
   public void addBindingAndValidation() {
       BeanValidationBinder<UserDetails> binder = new BeanValidationBinder<>(UserDetails.class);
       binder.bindInstanceFields(registrationForm);

       // A custom validator for password fields
       binder.forField(registrationForm.getPassword())
               .withValidator(this::passwordValidator).bind("password");

       // Set the label where bean-level error messages go
       binder.setStatusLabel(registrationForm.getError());

       // And finally the submit button
       registrationForm.getSubmitButton().addClickListener(event -> {
           try {
               // Create empty bean to store the details into
               UserDetails userBean = new UserDetails();

               // Run validators and write the values to the bean
               binder.writeBean(userBean);

               // Typically, you would here call backend to store the bean

               // Show success message if everything went well
               showSuccess(userBean);
           } catch (ValidationException exception) {
               // validation errors are already visible for each field,
               // and bean-level errors are shown in the status label.
               // We could show additional messages here if we want, do logging, etc.
           }
       });
   }

   /**
    * Method to validate that:
    * 1) Password is at least 8 characters long
    * */

   private ValidationResult passwordValidator(String pass1, ValueContext ctx) {
       /*
        * Just a simple length check. A real version should check for password
        * complexity as well!
        */

       if (pass1 == null || pass1.length() < 8) {
           return ValidationResult.error("Password should be at least 8 characters long");
       }

       if (!enablePasswordValidation) {
           // user hasn't visited the field yet, so don't validate just yet, but next time.
           enablePasswordValidation = true;
           return ValidationResult.ok();
       }

      return ValidationResult.ok();
   }

   /**
    * We call this method when form submission has succeeded
    */
   private void showSuccess(UserDetails userBean) {
       Notification notification =
               Notification.show("Data saved, welcome " + userBean.getFirstName());
       notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);

      // Here you'd typically redirect the user to another view
      UI.getCurrent().navigate(MainLayout.class);
   }
}