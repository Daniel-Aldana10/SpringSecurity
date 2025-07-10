package com.example.security;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Controller responsible for handling user registration requests.
 * <p>
 * This controller processes POST requests to the "/registro" endpoint.
 * It checks whether the requested username is already taken and either
 * returns an error message or proceeds with user registration.
 */
@Controller
public class ControllerRegister {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    /**
     * Handles user registration.
     *
     * @param user         The user object submitted from the registration form.
     * @param model        Spring's model to pass attributes to the view.
     * @param httpSession  The HTTP session used to store user information after registration.
     * @return             Redirects to "/hello" upon successful registration, or redisplays the
     *                     registration page with an error message if the username is already taken.
     */
    @PostMapping("/registro")
    public String register(@ModelAttribute User user, Model model, HttpSession httpSession) {
        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
            model.addAttribute("errorMessage", "Username is already taken.");
            return "register";
        }

        userService.registerUser(user.getUsername(), user.getPassword(), httpSession);
        return "redirect:/hello";
    }
}
