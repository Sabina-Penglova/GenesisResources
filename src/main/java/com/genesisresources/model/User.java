package com.genesisresources.model;

public class User {
    private Long id;
    private String name;
    private String surname;
    private String personId;
    private String uuid;

    public User() {}

    // Gettery a settery
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public String getPersonId() { return personId; }
    public void setPersonId(String personId) { this.personId = personId; }

    public String getUuid() { return uuid; }
    public void setUuid(String uuid) { this.uuid = uuid; }
}
