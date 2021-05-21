package com.co.generador;

import com.co.modelo.Login;
import com.co.modelo.Post;
import com.co.modelo.Tag;
import com.co.utilities.Utilities;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.apache.log4j.Logger;

public class Generador extends javax.swing.JFrame {

    final static Logger logger = Logger.getLogger(Generador.class);
    private String content;
    private final String pathSystem;
    private Properties properties;

    public Generador() {
        initComponents();
        this.pathSystem = new File("").getAbsolutePath();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        caseTest = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        iterationsIndex = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        dataCreate = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Funcionalidad");

        caseTest.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "login_with_incorrect_user_and_password", "login-with-valid-user-and-invalid-password", "post_creation_new_post_button", "post_creation_new_post_button_title_over_limit", "post_creation_plus_button", "post_creation_plus_button_title_over_limit", "tag_manage_add_metadata_to_tag", "tag_manage_create_new_tag" }));
        caseTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseTestActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad de datos aleatorio");

        iterationsIndex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        jLabel3.setText("Tipo de generacion de datos");

        dataCreate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pool de datos a-priori", "Pool de datos (pseudo) aleatorio dinámico", "Aleatorio" }));

        jButton1.setText("Generar datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar generacion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton3.setText("Eliminar archivos creados");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(89, 89, 89)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton3)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(37, 37, 37)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(iterationsIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(caseTest, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dataCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(caseTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(iterationsIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dataCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String feature = pathSystem.endsWith("/")
                    ? pathSystem + "proyecto/features/" + caseTest.getSelectedItem().toString()
                    : pathSystem + "/proyecto/features/" + caseTest.getSelectedItem().toString();
            deletesFiles(feature);
            jTextArea1.setText("Proceso ejecutado exitosamente, se eliminaron los archivos creados con el proceso " + caseTest.getSelectedItem().toString());
        } catch (Exception e) {
            jTextArea1.setText(e.toString());
            logger.error("Se presentaron problemas para eliminar los archivos creados ", e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            jTextArea1.setText("");
            this.properties = Utilities.loadProperties(pathSystem.endsWith("/")
                    ? pathSystem + "Properties/Config.Properties"
                    : pathSystem + "/Properties/Config.Properties");
            String feature = pathSystem.endsWith("/")
                    ? pathSystem + "proyecto/features/" + caseTest.getSelectedItem().toString()
                    : pathSystem + "/proyecto/features/" + caseTest.getSelectedItem().toString();
            content = this.readContent(feature + ".feature");
            this.deletesFiles(feature);
            this.executeTest();
            jTextArea1.setText("Proceso ejcutado exitosament revise la ruta de los test que se creo un nuevo archivo con la forma solicitada");

        } catch (Exception e) {
            jTextArea1.setText(e.toString());
            logger.error("Se presentaron problemas para generar los datos aleatorios ", e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private String readContent(String path) throws IOException {
        return Utilities.readFile(path);
    }

    private void deletesFiles(String path) {
        for (int i = 0; i < 21; i++) {
            String pathNameSystem = path + "_" + i + ".feature";
            Utilities.eliminarFiles(pathNameSystem);
        }
    }

    private void executeTest() throws IOException {
        String valuesReplace = "";
        List<List<String>> dto = null;
        switch (caseTest.getSelectedItem().toString()) {
            case "login_with_incorrect_user_and_password":
                switch (dataCreate.getSelectedItem().toString()) {
                    case "Pool de datos a-priori":
                        List<Login> data = new Gson().fromJson(getModel(6, "/Pool-datos/"), new TypeToken<List<Login>>() {
                        }.getType());
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertLoginToArrayString(data);
                        break;
                    case "Pool de datos (pseudo) aleatorio dinámico":
                        List<Login> dtaLogin = new ArrayList<>();
                        for (int i = 0; i < Integer.parseInt(iterationsIndex.getSelectedItem().toString()); i++) {
                            dtaLogin.add(Utilities.generateDataAleatoriaLogin());
                        }
                        String folderFeature = pathSystem.endsWith("/") ? pathSystem + "Data/" + caseTest.getSelectedItem().toString() + "/Pseudo-Datos/" + caseTest.getSelectedItem().toString() + "_1.json"
                                : pathSystem + "/Data/" + caseTest.getSelectedItem().toString() + "/Pseudo-Datos/" + caseTest.getSelectedItem().toString() + "_1.json";
                        Utilities.createFile(folderFeature);
                        Utilities.writeFile(folderFeature, new Gson().toJson(dtaLogin));
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertLoginToArrayString(dtaLogin);
                        break;
                    case "Aleatorio":
                        List<Login> loginAleatoria = new ArrayList<>();
                        for (int i = 0; i < Integer.parseInt(iterationsIndex.getSelectedItem().toString()); i++) {
                            Login dtoModel = Utilities.generateDataAleatoriaLogin();
                            Login login = new Login();
                            login.setUser(dtoModel.getUser());
                            int randomOpcion = (int) (Math.random() * 4);
                            switch (randomOpcion) {
                                case 0:
                                    login.setPassword(Utilities.generateDataAleatoriaString());
                                    break;
                                case 1:
                                    login.setPassword(String.valueOf(Utilities.generateDataAleatoriaInteger()));
                                    break;
                                case 2:
                                    login.setPassword(String.valueOf(Utilities.generateDataAleatoriaDate()));
                                    break;
                                default:
                                    login.setPassword(
                                            (String.valueOf(Utilities.generateDataAleatoriaDate()) + Utilities.generateDataAleatoriaInteger() + Utilities.generateDataAleatoriaString()));

                            }
                            loginAleatoria.add(login);
                        }
                        String folderFeatureAleatoria = pathSystem.endsWith("/") ? pathSystem + "Data/" + caseTest.getSelectedItem().toString() + "/Aleatoria/" + caseTest.getSelectedItem().toString() + "_1.json"
                                : pathSystem + "/Data/" + caseTest.getSelectedItem().toString() + "/Aleatoria/" + caseTest.getSelectedItem().toString() + "_1.json";
                        Utilities.createFile(folderFeatureAleatoria);
                        Utilities.writeFile(folderFeatureAleatoria, new Gson().toJson(loginAleatoria));
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertLoginToArrayString(loginAleatoria);
                        break;
                }
                break;
            case "login-with-valid-user-and-invalid-password":
                switch (dataCreate.getSelectedItem().toString()) {
                    case "Pool de datos a-priori":
                        List<Login> data = new Gson().fromJson(getModel(6, "/Pool-datos/"), new TypeToken<List<Login>>() {
                        }.getType());
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertLoginToArrayString(data);
                        break;
                    case "Pool de datos (pseudo) aleatorio dinámico":
                        List<Login> dtaLogin = new ArrayList<>();
                        for (int i = 0; i < Integer.parseInt(iterationsIndex.getSelectedItem().toString()); i++) {
                            dtaLogin.add(Utilities.generateDataAleatoriaLogin());
                        }
                        String folderFeature = pathSystem.endsWith("/") ? pathSystem + "Data/" + caseTest.getSelectedItem().toString() + "/Pseudo-Datos/" + caseTest.getSelectedItem().toString() + "_1.json"
                                : pathSystem + "/Data/" + caseTest.getSelectedItem().toString() + "/Pseudo-Datos/" + caseTest.getSelectedItem().toString() + "_1.json";
                        Utilities.createFile(folderFeature);
                        Utilities.writeFile(folderFeature, new Gson().toJson(dtaLogin));
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertLoginToArrayString(dtaLogin);
                        break;
                    case "Aleatorio":
                        List<Login> loginAleatoria = new ArrayList<>();
                        for (int i = 0; i < Integer.parseInt(iterationsIndex.getSelectedItem().toString()); i++) {
                            Login dtoModel = Utilities.generateDataAleatoriaLogin();
                            Login login = new Login();
                            login.setUser(dtoModel.getUser());
                            int randomOpcion = (int) (Math.random() * 4);
                            switch (randomOpcion) {
                                case 0:
                                    login.setPassword(Utilities.generateDataAleatoriaString());
                                    break;
                                case 1:
                                    login.setPassword(String.valueOf(Utilities.generateDataAleatoriaInteger()));
                                    break;
                                case 2:
                                    login.setPassword(String.valueOf(Utilities.generateDataAleatoriaDate()));
                                    break;
                                default:
                                    login.setPassword(
                                            (String.valueOf(Utilities.generateDataAleatoriaDate()) + Utilities.generateDataAleatoriaInteger() + Utilities.generateDataAleatoriaString()));

                            }
                            loginAleatoria.add(login);
                        }
                        String folderFeatureAleatoria = pathSystem.endsWith("/") ? pathSystem + "Data/" + caseTest.getSelectedItem().toString() + "/Aleatoria/" + caseTest.getSelectedItem().toString() + "_1.json"
                                : pathSystem + "/Data/" + caseTest.getSelectedItem().toString() + "/Aleatoria/" + caseTest.getSelectedItem().toString() + "_1.json";
                        Utilities.createFile(folderFeatureAleatoria);
                        Utilities.writeFile(folderFeatureAleatoria, new Gson().toJson(loginAleatoria));
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertLoginToArrayString(loginAleatoria);
                        break;
                }
                break;
            case "post_creation_new_post_button":
                switch (dataCreate.getSelectedItem().toString()) {
                    case "Pool de datos a-priori":
                        List<Post> data = new Gson().fromJson(getModel(3, "/Pool-datos/"), new TypeToken<List<Post>>() {
                        }.getType());
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertPostToArrayString(data);
                        break;
                    case "Pool de datos (pseudo) aleatorio dinámico":
                        List<Post> dtaPost = new ArrayList<>();
                        for (int i = 0; i < Integer.parseInt(iterationsIndex.getSelectedItem().toString()); i++) {
                            dtaPost.add(Utilities.generateDataAleatoriaPost());
                        }
                        String folderFeature = pathSystem.endsWith("/") ? pathSystem + "Data/" + caseTest.getSelectedItem().toString() + "/Pseudo-Datos/" + caseTest.getSelectedItem().toString() + "_1.json"
                                : pathSystem + "/Data/" + caseTest.getSelectedItem().toString() + "/Pseudo-Datos/" + caseTest.getSelectedItem().toString() + "_1.json";
                        Utilities.createFile(folderFeature);
                        Utilities.writeFile(folderFeature, new Gson().toJson(dtaPost));
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertPostToArrayString(dtaPost);
                        break;
                    case "Aleatorio":
                        List<Post> postAleatoria = new ArrayList<>();
                        for (int i = 0; i < Integer.parseInt(iterationsIndex.getSelectedItem().toString()); i++) {
                            Post post = new Post();
                            int randomOpcion = (int) (Math.random() * 4);
                            switch (randomOpcion) {
                                case 0:
                                    post.setName(Utilities.generateDataAleatoriaString());
                                    break;
                                case 1:
                                    post.setName(String.valueOf(Utilities.generateDataAleatoriaInteger()));
                                    break;
                                case 2:
                                    post.setName(String.valueOf(Utilities.generateDataAleatoriaDate()));
                                    break;
                                default:
                                    post.setName(
                                            (String.valueOf(Utilities.generateDataAleatoriaDate()) + Utilities.generateDataAleatoriaInteger() + Utilities.generateDataAleatoriaString()));

                            }
                            postAleatoria.add(post);
                        }
                        String folderFeatureAleatoria = pathSystem.endsWith("/") ? pathSystem + "Data/" + caseTest.getSelectedItem().toString() + "/Aleatoria/" + caseTest.getSelectedItem().toString() + "_1.json"
                                : pathSystem + "/Data/" + caseTest.getSelectedItem().toString() + "/Aleatoria/" + caseTest.getSelectedItem().toString() + "_1.json";
                        Utilities.createFile(folderFeatureAleatoria);
                        Utilities.writeFile(folderFeatureAleatoria, new Gson().toJson(postAleatoria));
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertPostToArrayString(postAleatoria);
                        break;
                }
                break;
            case "post_creation_new_post_button_title_over_limit":
                switch (dataCreate.getSelectedItem().toString()) {
                    case "Pool de datos a-priori":
                        List<Post> data = new Gson().fromJson(getModel(3, "/Pool-datos/"), new TypeToken<List<Post>>() {
                        }.getType());
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertPostToArrayString(data);
                        break;
                    case "Pool de datos (pseudo) aleatorio dinámico":
                        List<Post> dtaPost = new ArrayList<>();
                        for (int i = 0; i < Integer.parseInt(iterationsIndex.getSelectedItem().toString()); i++) {
                            Post post = Utilities.generateDataAleatoriaPost();
                            while (post.getName() == null || post.getName().length() < 255) {
                                post.setName(post.getName() + Utilities.generateDataAleatoriaString());
                            }
                            dtaPost.add(post);
                        }
                        String folderFeature = pathSystem.endsWith("/") ? pathSystem + "Data/" + caseTest.getSelectedItem().toString() + "/Pseudo-Datos/" + caseTest.getSelectedItem().toString() + "_1.json"
                                : pathSystem + "/Data/" + caseTest.getSelectedItem().toString() + "/Pseudo-Datos/" + caseTest.getSelectedItem().toString() + "_1.json";
                        Utilities.createFile(folderFeature);
                        Utilities.writeFile(folderFeature, new Gson().toJson(dtaPost));
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertPostToArrayString(dtaPost);
                        break;
                    case "Aleatorio":
                        List<Post> postAleatoria = new ArrayList<>();
                        for (int i = 0; i < Integer.parseInt(iterationsIndex.getSelectedItem().toString()); i++) {
                            Post post = new Post();
                            int randomOpcion = (int) (Math.random() * 4);
                            while (post.getName() == null || post.getName().length() < 255) {
                                switch (randomOpcion) {
                                    case 0:
                                        post.setName(post.getName() + Utilities.generateDataAleatoriaString());
                                        break;
                                    case 1:
                                        post.setName(post.getName() + String.valueOf(Utilities.generateDataAleatoriaInteger()));
                                        break;
                                    case 2:
                                        post.setName(post.getName() + String.valueOf(Utilities.generateDataAleatoriaDate()));
                                        break;
                                    default:
                                        post.setName(post.getName()
                                                + (String.valueOf(Utilities.generateDataAleatoriaDate()) + Utilities.generateDataAleatoriaInteger() + Utilities.generateDataAleatoriaString()));

                                }
                            }

                            postAleatoria.add(post);
                        }
                        String folderFeatureAleatoria = pathSystem.endsWith("/") ? pathSystem + "Data/" + caseTest.getSelectedItem().toString() + "/Aleatoria/" + caseTest.getSelectedItem().toString() + "_1.json"
                                : pathSystem + "/Data/" + caseTest.getSelectedItem().toString() + "/Aleatoria/" + caseTest.getSelectedItem().toString() + "_1.json";
                        Utilities.createFile(folderFeatureAleatoria);
                        Utilities.writeFile(folderFeatureAleatoria, new Gson().toJson(postAleatoria));
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertPostToArrayString(postAleatoria);
                        break;
                }
                break;
            case "post_creation_plus_button":
                switch (dataCreate.getSelectedItem().toString()) {
                    case "Pool de datos a-priori":
                        List<Post> data = new Gson().fromJson(getModel(3, "/Pool-datos/"), new TypeToken<List<Post>>() {
                        }.getType());
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertPostToArrayString(data);
                        break;
                    case "Pool de datos (pseudo) aleatorio dinámico":
                        List<Post> dtaPost = new ArrayList<>();
                        for (int i = 0; i < Integer.parseInt(iterationsIndex.getSelectedItem().toString()); i++) {
                            dtaPost.add(Utilities.generateDataAleatoriaPost());
                        }
                        String folderFeature = pathSystem.endsWith("/") ? pathSystem + "Data/" + caseTest.getSelectedItem().toString() + "/Pseudo-Datos/" + caseTest.getSelectedItem().toString() + "_1.json"
                                : pathSystem + "/Data/" + caseTest.getSelectedItem().toString() + "/Pseudo-Datos/" + caseTest.getSelectedItem().toString() + "_1.json";
                        Utilities.createFile(folderFeature);
                        Utilities.writeFile(folderFeature, new Gson().toJson(dtaPost));
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertPostToArrayString(dtaPost);
                        break;
                    case "Aleatorio":
                        List<Post> postAleatoria = new ArrayList<>();
                        for (int i = 0; i < Integer.parseInt(iterationsIndex.getSelectedItem().toString()); i++) {
                            Post post = new Post();
                            int randomOpcion = (int) (Math.random() * 4);
                            switch (randomOpcion) {
                                case 0:
                                    post.setName(Utilities.generateDataAleatoriaString());
                                    break;
                                case 1:
                                    post.setName(String.valueOf(Utilities.generateDataAleatoriaInteger()));
                                    break;
                                case 2:
                                    post.setName(String.valueOf(Utilities.generateDataAleatoriaDate()));
                                    break;
                                default:
                                    post.setName(
                                            (String.valueOf(Utilities.generateDataAleatoriaDate()) + Utilities.generateDataAleatoriaInteger() + Utilities.generateDataAleatoriaString()));

                            }
                            postAleatoria.add(post);
                        }
                        String folderFeatureAleatoria = pathSystem.endsWith("/") ? pathSystem + "Data/" + caseTest.getSelectedItem().toString() + "/Aleatoria/" + caseTest.getSelectedItem().toString() + "_1.json"
                                : pathSystem + "/Data/" + caseTest.getSelectedItem().toString() + "/Aleatoria/" + caseTest.getSelectedItem().toString() + "_1.json";
                        Utilities.createFile(folderFeatureAleatoria);
                        Utilities.writeFile(folderFeatureAleatoria, new Gson().toJson(postAleatoria));
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertPostToArrayString(postAleatoria);
                        break;
                }
                break;
            case "post_creation_plus_button_title_over_limit":
                switch (dataCreate.getSelectedItem().toString()) {
                    case "Pool de datos a-priori":
                        List<Post> data = new Gson().fromJson(getModel(3, "/Pool-datos/"), new TypeToken<List<Post>>() {
                        }.getType());
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertPostToArrayString(data);
                        break;
                    case "Pool de datos (pseudo) aleatorio dinámico":
                        List<Post> dtaPost = new ArrayList<>();
                        for (int i = 0; i < Integer.parseInt(iterationsIndex.getSelectedItem().toString()); i++) {
                            Post post = Utilities.generateDataAleatoriaPost();
                            while (post.getName() == null || post.getName().length() < 255) {
                                post.setName(post.getName() + Utilities.generateDataAleatoriaString());
                            }
                            dtaPost.add(post);
                        }
                        String folderFeature = pathSystem.endsWith("/") ? pathSystem + "Data/" + caseTest.getSelectedItem().toString() + "/Pseudo-Datos/" + caseTest.getSelectedItem().toString() + "_1.json"
                                : pathSystem + "/Data/" + caseTest.getSelectedItem().toString() + "/Pseudo-Datos/" + caseTest.getSelectedItem().toString() + "_1.json";
                        Utilities.createFile(folderFeature);
                        Utilities.writeFile(folderFeature, new Gson().toJson(dtaPost));
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertPostToArrayString(dtaPost);
                        break;
                    case "Aleatorio":
                        List<Post> postAleatoria = new ArrayList<>();
                        for (int i = 0; i < Integer.parseInt(iterationsIndex.getSelectedItem().toString()); i++) {
                            Post post = new Post();
                            int randomOpcion = (int) (Math.random() * 4);
                            while (post.getName() == null ||post.getName().length() < 255) {
                                switch (randomOpcion) {
                                    case 0:
                                        post.setName(post.getName() + Utilities.generateDataAleatoriaString());
                                        break;
                                    case 1:
                                        post.setName(post.getName() + String.valueOf(Utilities.generateDataAleatoriaInteger()));
                                        break;
                                    case 2:
                                        post.setName(post.getName() + String.valueOf(Utilities.generateDataAleatoriaDate()));
                                        break;
                                    default:
                                        post.setName(post.getName()
                                                + (String.valueOf(Utilities.generateDataAleatoriaDate()) + Utilities.generateDataAleatoriaInteger() + Utilities.generateDataAleatoriaString()));

                                }
                            }

                            postAleatoria.add(post);
                        }
                        String folderFeatureAleatoria = pathSystem.endsWith("/") ? pathSystem + "Data/" + caseTest.getSelectedItem().toString() + "/Aleatoria/" + caseTest.getSelectedItem().toString() + "_1.json"
                                : pathSystem + "/Data/" + caseTest.getSelectedItem().toString() + "/Aleatoria/" + caseTest.getSelectedItem().toString() + "_1.json";
                        Utilities.createFile(folderFeatureAleatoria);
                        Utilities.writeFile(folderFeatureAleatoria, new Gson().toJson(postAleatoria));
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertPostToArrayString(postAleatoria);
                        break;
                }
                break;
            case "tag_manage_add_metadata_to_tag":
                switch (dataCreate.getSelectedItem().toString()) {
                    case "Pool de datos a-priori":
                        List<Tag> data = new Gson().fromJson(getModel(10, "/Pool-datos/"), new TypeToken<List<Tag>>() {
                        }.getType());
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertTagToArrayString(data);
                        break;
                    case "Pool de datos (pseudo) aleatorio dinámico":
                        List<Tag> dtaTag = new ArrayList<>();
                        for (int i = 0; i < Integer.parseInt(iterationsIndex.getSelectedItem().toString()); i++) {
                            dtaTag.add(Utilities.generateDataAleatoriaTag());
                        }
                        String folderFeature = pathSystem.endsWith("/") ? pathSystem + "Data/" + caseTest.getSelectedItem().toString() + "/Pseudo-Datos/" + caseTest.getSelectedItem().toString() + "_1.json"
                                : pathSystem + "/Data/" + caseTest.getSelectedItem().toString() + "/Pseudo-Datos/" + caseTest.getSelectedItem().toString() + "_1.json";
                        Utilities.createFile(folderFeature);
                        Utilities.writeFile(folderFeature, new Gson().toJson(dtaTag));
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertTagToArrayString(dtaTag);
                        break;
                    case "Aleatorio":
                        List<Tag> tagAleatoria = new ArrayList<>();
                        for (int i = 0; i < Integer.parseInt(iterationsIndex.getSelectedItem().toString()); i++) {
                            Tag tag = new Tag();
                            int randomOpcion = (int) (Math.random() * 4);
                            switch (randomOpcion) {
                                case 0:
                                    tag.setName(Utilities.generateDataAleatoriaString());
                                    break;
                                case 1:
                                    tag.setName(String.valueOf(Utilities.generateDataAleatoriaInteger()));
                                    break;
                                case 2:
                                    tag.setName(String.valueOf(Utilities.generateDataAleatoriaDate()));
                                    break;
                                default:
                                    tag.setName(
                                            (String.valueOf(Utilities.generateDataAleatoriaDate()) + Utilities.generateDataAleatoriaInteger() + Utilities.generateDataAleatoriaString()));

                            }
                            tagAleatoria.add(tag);
                        }
                        String folderFeatureAleatoria = pathSystem.endsWith("/") ? pathSystem + "Data/" + caseTest.getSelectedItem().toString() + "/Aleatoria/" + caseTest.getSelectedItem().toString() + "_1.json"
                                : pathSystem + "/Data/" + caseTest.getSelectedItem().toString() + "/Aleatoria/" + caseTest.getSelectedItem().toString() + "_1.json";
                        Utilities.createFile(folderFeatureAleatoria);
                        Utilities.writeFile(folderFeatureAleatoria, new Gson().toJson(tagAleatoria));
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertTagToArrayString(tagAleatoria);
                        break;
                }
                break;
            case "tag_manage_create_new_tag":
                switch (dataCreate.getSelectedItem().toString()) {
                    case "Pool de datos a-priori":
                        List<Tag> data = new Gson().fromJson(getModel(7, "/Pool-datos/"), new TypeToken<List<Tag>>() {
                        }.getType());
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertTagToArrayString(data);
                        break;
                    case "Pool de datos (pseudo) aleatorio dinámico":
                        List<Tag> dtaTag = new ArrayList<>();
                        for (int i = 0; i < Integer.parseInt(iterationsIndex.getSelectedItem().toString()); i++) {
                            dtaTag.add(Utilities.generateDataAleatoriaTag());
                        }
                        String folderFeature = pathSystem.endsWith("/") ? pathSystem + "Data/" + caseTest.getSelectedItem().toString() + "/Pseudo-Datos/" + caseTest.getSelectedItem().toString() + "_1.json"
                                : pathSystem + "/Data/" + caseTest.getSelectedItem().toString() + "/Pseudo-Datos/" + caseTest.getSelectedItem().toString() + "_1.json";
                        Utilities.createFile(folderFeature);
                        Utilities.writeFile(folderFeature, new Gson().toJson(dtaTag));
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertTagToArrayString(dtaTag);
                        break;
                    case "Aleatorio":
                       List<Tag> tagAleatoria = new ArrayList<>();
                        for (int i = 0; i < Integer.parseInt(iterationsIndex.getSelectedItem().toString()); i++) {
                            Tag tag = new Tag();
                            int randomOpcion = (int) (Math.random() * 4);
                            switch (randomOpcion) {
                                case 0:
                                    tag.setName(Utilities.generateDataAleatoriaString());
                                    break;
                                case 1:
                                    tag.setName(String.valueOf(Utilities.generateDataAleatoriaInteger()));
                                    break;
                                case 2:
                                    tag.setName(String.valueOf(Utilities.generateDataAleatoriaDate()));
                                    break;
                                default:
                                    tag.setName(
                                            (String.valueOf(Utilities.generateDataAleatoriaDate()) + Utilities.generateDataAleatoriaInteger() + Utilities.generateDataAleatoriaString()));

                            }
                            tagAleatoria.add(tag);
                        }
                        String folderFeatureAleatoria = pathSystem.endsWith("/") ? pathSystem + "Data/" + caseTest.getSelectedItem().toString() + "/Aleatoria/" + caseTest.getSelectedItem().toString() + "_1.json"
                                : pathSystem + "/Data/" + caseTest.getSelectedItem().toString() + "/Aleatoria/" + caseTest.getSelectedItem().toString() + "_1.json";
                        Utilities.createFile(folderFeatureAleatoria);
                        Utilities.writeFile(folderFeatureAleatoria, new Gson().toJson(tagAleatoria));
                        valuesReplace = this.properties.getProperty(caseTest.getSelectedItem().toString());
                        dto = Utilities.convertTagToArrayString(tagAleatoria);
                        break;
                }
                break;
        }
        this.iteradorToCreateFilesWithData(valuesReplace.split(","), dto);
    }

    private void iteradorToCreateFilesWithData(String[] replace, List<List<String>> dto) throws IOException {
        for (int i = 0; i < Integer.parseInt(iterationsIndex.getSelectedItem().toString()); i++) {
            List<String> fields = dto.get(i);
            String contendFiel = this.content;
            for (int k = 0; k < replace.length; k++) {
                contendFiel = contendFiel.replace(replace[k], fields.get(k));
            }
            String folderFeature = pathSystem.endsWith("/") ? pathSystem + "proyecto/features" : pathSystem + "/proyecto/features/";
            String pathNameSystem = folderFeature + caseTest.getSelectedItem().toString() + "_" + i + ".feature";
            Utilities.createFile(pathNameSystem);
            Utilities.writeFile(pathNameSystem, contendFiel);
        }
    }

    private String getModel(int random, String folder) throws IOException {
        int indexFile = (int) (Math.random() * random);
        String fileRead = pathSystem.endsWith("/")
                ? (pathSystem + "Data/" + caseTest.getSelectedItem().toString() + folder
                + caseTest.getSelectedItem().toString() + "_" + indexFile + ".json")
                : (pathSystem + "/Data/" + caseTest.getSelectedItem().toString() + folder
                + caseTest.getSelectedItem().toString() + "_" + indexFile + ".json");
        logger.info("Se va leer el siguiente archivo " + fileRead);
        return Utilities.readFile(fileRead);
    }

    private void caseTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caseTestActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            StringBuilder message = new StringBuilder();
            for (int i = 0; i < caseTest.getItemCount(); i++) {
                deletesFiles(caseTest.getItemAt(i).toString());
                message.append("Los archivos creados con el proceso  ");
                message.append(caseTest.getItemAt(i).toString());
                message.append(" fueron eliminados exitosamente");
                message.append("\r\n");
            }
            jTextArea1.setText(message.toString());
        } catch (Exception e) {
            jTextArea1.setText("Se presentaron problemas para eliminar los archivos " + e.toString());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Generador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox caseTest;
    private javax.swing.JComboBox dataCreate;
    private javax.swing.JComboBox iterationsIndex;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
