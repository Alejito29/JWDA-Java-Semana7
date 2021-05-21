package com.co.utilities;

import com.co.modelo.Login;
import com.co.modelo.Post;
import com.co.modelo.Tag;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import org.apache.log4j.Logger;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class Utilities {

    final static Logger logger = Logger.getLogger(Utilities.class);

    public static void eliminarFiles(String path) {
        File fichero = new File(path);

        if (fichero.delete()) {
            logger.info("El fichero ha sido borrado satisfactoriamente " + path);
        } else {
            logger.error("El siguiente archivo no pudo ser borrado " + path);
        }
    }

    public static String readFile(String path) throws IOException {
        StringBuilder entrada = new StringBuilder();
        FileReader fileReader = new FileReader(path);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String cadena;
            while ((cadena = bufferedReader.readLine()) != null) {
                entrada.append(cadena);
                entrada.append("\r\n");
            }
        }
        return entrada.toString();
    }

    public static void createFile(String path) throws IOException {
        File file = new File(path);

        if (file.createNewFile()) {
            logger.info("Archivo creado exitosamente " + path);
        } else {
            logger.warn("Este archivo ya existe " + path);
        }
    }

    public static void writeFile(String path, String content) throws IOException {
        String ruta = path;
        File archivo = new File(ruta);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            bw.write(content);
        }
    }

    public static Login generateDataAleatoriaLogin() {
        PodamFactory factory = new PodamFactoryImpl();
        Login login = factory.manufacturePojo(Login.class);
        String correo = login.getPassword() + "@gmail.com";
        login.setUser(correo);
        return login;
    }

    public static String generateDataAleatoriaString() {
        PodamFactory factory = new PodamFactoryImpl();
        return factory.manufacturePojo(String.class);
    }

    public static Date generateDataAleatoriaDate() {
        PodamFactory factory = new PodamFactoryImpl();
        return factory.manufacturePojo(Date.class);
    }

    public static Integer generateDataAleatoriaInteger() {
        PodamFactory factory = new PodamFactoryImpl();
        return factory.manufacturePojo(Integer.class);
    }

    public static Post generateDataAleatoriaPost() {
        PodamFactory factory = new PodamFactoryImpl();
        return factory.manufacturePojo(Post.class);
    }

    public static Tag generateDataAleatoriaTag() {
        PodamFactory factory = new PodamFactoryImpl();
        return factory.manufacturePojo(Tag.class);
    }

    public static Properties loadProperties(String path) throws FileNotFoundException, IOException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream(path);
        properties.load(fis);
        return properties;
    }

    public static List<List<String>> convertLoginToArrayString(List<Login> login) {
        List<List<String>> dto = new ArrayList<>();
        for (Login login1 : login) {
            List<String> dataLogin = new ArrayList<>();
            String user = login1.getUser();
            String password = login1.getPassword();
            dataLogin.add(user);
            dataLogin.add(password);
            dto.add(dataLogin);
        }
        return dto;
    }

    public static List<List<String>> convertPostToArrayString(List<Post> post) {
        List<List<String>> dto = new ArrayList<>();
        for (Post posted : post) {
            List<String> dataPost = new ArrayList<>();
            String name = posted.getName();
            dataPost.add(name);
            dto.add(dataPost);
        }
        return dto;
    }

    public static List<List<String>> convertTagToArrayString(List<Tag> tag) {
        List<List<String>> dto = new ArrayList<>();
        for (Tag tags : tag) {
            List<String> dataTag = new ArrayList<>();
            String name = tags.getName();
            dataTag.add(name);
            dto.add(dataTag);
        }
        return dto;
    }
}
