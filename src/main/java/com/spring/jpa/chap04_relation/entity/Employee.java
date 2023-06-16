package com.spring.jpa.chap04_relation.entity;

import lombok.*;

import javax.persistence.*;

@Setter @Getter
@ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_emp")
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "emp_id")
  private long id;

  @Column(name = "emp_name", nullable = false)
  private String name;

  @ManyToOne //내가  N이고 얘가 1이면
  @JoinColumn(name = "dept_id") //join할 이름
  private Department department; // 단방향 연관관계

}
