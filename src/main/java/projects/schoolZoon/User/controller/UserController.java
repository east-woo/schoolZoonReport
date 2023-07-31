package projects.schoolZoon.User.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/user")
@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
@RequiredArgsConstructor
@RestController
public class UserController {

    @GetMapping("/posts")
    public ResponseEntity<?> readPosts(            /*@PageableDefault(size = 20, sort = "id", direction = Sort.Direction.DESC) Pageable pageable*/) {


        return ResponseEntity.ok("조송화 바보");
    }
}
