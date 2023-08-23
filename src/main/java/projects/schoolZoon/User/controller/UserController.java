package projects.schoolZoon.User.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/users")
@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
@RequiredArgsConstructor
@RestController
public class UserController {

/*
    /api/users/register
    /api/users/login
    /api/reports
    /api/reports/{reportId}
    /api/vehicles
    /api/vehicles/{vehicleId}
    /api/images/upload
    /api/images/{imageId}
    /api/ocr/process
*/

    @PostMapping("/signUp")
    public ResponseEntity<?> signUp() {
        return ResponseEntity.ok("signUp");
    }

    @PostMapping("/login")
    public ResponseEntity<?> login() {
        return ResponseEntity.ok("login");
    }
    @PostMapping("/me")
    public ResponseEntity<?> me() {
        return ResponseEntity.ok("me");
    }

    @GetMapping("/infoChange")
    public ResponseEntity<?> infoChange() {
        return ResponseEntity.ok("infoChange");
    }

    @GetMapping("/passwordChange")
    public ResponseEntity<?> passwordChange() {
        return ResponseEntity.ok("passwordChange");
    }
}
