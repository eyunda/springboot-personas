package com.tutoria1.demo.Controlador;


import com.tutoria1.demo.Modelo.Persona;
import com.tutoria1.demo.Modelo.Rol;
import com.tutoria1.demo.Modelo.Usuario;
import com.tutoria1.demo.Modelo.UsuarioRol;
import com.tutoria1.demo.Servicios.PersonaService;
import com.tutoria1.demo.Servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.net.URI;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/person")
@CrossOrigin("*")
public class PersonaController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/")
    public Usuario guardarPersona(@RequestBody Usuario usuario) throws Exception{
        usuario.setPerfil("default.png");
        Set<UsuarioRol> usuarioRoles = new HashSet<>();

        Rol rol = new Rol();
        rol.setRolId(2L);
        rol.setRolNombre("NORMAL");

        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);

        usuarioRoles.add(usuarioRol);
        return usuarioService.guardarUsuario(usuario,usuarioRoles);
    }


    @GetMapping("/mostar/{username}")
    public Usuario obtenerPersona(@PathVariable("username") String username){
        return usuarioService.obtenerUsuario(username);
    }

    @DeleteMapping("/eliminar/{usuarioId}")
    public void eliminarPersona(@PathVariable("usuarioId") Long usuarioId){
        usuarioService.eliminarUsuario(usuarioId);
    }

    @Autowired
	private PersonaService personaService;
	
    /*
    @GetMapping("/listar")
	private ResponseEntity<List<Usuario>> getAllPersonas (){
		return ResponseEntity.ok(personaService.findAll());
	}
	*/
    
    @GetMapping("/listar/{userId}")
    public Usuario listaruser(@PathVariable("userId") Long userId){
 
		return usuarioService.obteneruser(userId);
    }
    
    @PutMapping("/editar/")
    public ResponseEntity<Usuario> actualizaruser(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.actualizarPersona(usuario));
    }
    
  
	@GetMapping
	private ResponseEntity<List<Persona>> getAllPersonas (){
		return ResponseEntity.ok(personaService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<Persona> savePersona (@RequestBody Persona persona){
		try {
			Persona personaGuardada = personaService.save(persona);		
		return ResponseEntity.created(new URI("/personas/"+personaGuardada.getId())).body(personaGuardada);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deletePersona (@PathVariable ("id") Long id){
		return ResponseEntity.ok(personaService.deleteById(id));
	}
}

