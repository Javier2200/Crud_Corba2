package PersonaApp;


/**
* PersonaApp/PersonaOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Persona.idl
* lunes 23 de abril de 2018 07:46:08 PM COT
*/

public interface PersonaOperations 
{
  boolean insertarPersona (int identificacion, String nombre, String apellido, String direccion, String telefono, String email);
  String consultarPersona (int identificacion);
  boolean eliminarPersona (int identificacion);
  boolean actualizarPersona (int identificacion, String nombre, String apellido, String direccion, String telefono, String email);
  String listarPersona ();
  void shutdown ();
} // interface PersonaOperations
