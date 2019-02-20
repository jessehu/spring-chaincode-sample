package org.sdcc.sample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Chaincode {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;

   @Column(nullable = false)
   private String name;

   @Column(nullable = false)
   private String version;
}