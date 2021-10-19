package tekshila.chatapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.UnsupportedMediaTypeStatusException;
import tekshila.chatapp.dto.UserDTO;
import tekshila.chatapp.service.UserService;

@RestController
@RequestMapping(path = "/api/v1")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/register",
                 consumes = MediaType.APPLICATION_JSON_VALUE,
                 produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody UserDTO signUp(@RequestBody UserDTO userDTO) {

        return userService.addUser(userDTO);
    }

    @GetMapping(path = "/user/{userId}")
    public @ResponseBody UserDTO getUser(@PathVariable(name = "userId") Integer userId) {
        return userService.getUser(userId);
    }





}
