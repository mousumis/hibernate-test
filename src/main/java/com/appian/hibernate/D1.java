package com.appian.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="d1")
public class D1 {
  @Id
  @Column(name="id")
  private int id;

  @Column(name="name", nullable = false)
  private String name;

  @Column(name="uuid", updatable = false, nullable = false, unique = true)
  private String uuid;

  public D1(int id, String name, String uuid) {
    this.id = id;
    this.name = name;
    this.uuid = uuid;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
