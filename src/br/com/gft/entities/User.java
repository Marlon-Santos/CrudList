package br.com.gft.entities;

import java.util.Objects;

public class User {
    private static Long id = 0L;
    private String name;
    private String email;
    private Long idF;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        idGenerate();
    }

    public long getIdF() {
        return idF;
    }

    private void idGenerate() {
        this.idF = this.getId();
        this.setId(this.getId() + 1L);
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return idF.equals(user.idF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idF);
    }

}
