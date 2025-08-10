
# Spring-Kafka-Phi3 AI Demo Project

**Description:**  
An integrated demo using **Spring Boot**, **Apache Kafka**, and **Microsoft Phi-3** (via Ollama) for real-time event processing, following the **Scrum** framework for project management.

---

## 🎯 Goal
Build an end-to-end pipeline:  
Spring Boot Producer → Kafka Topic → Spring Boot Consumer → AI Phi-3 → Processed Response.

---

## 📅 Project Journal
Day-by-day documentation is available in `/scrum-days`:

- [Day 0 – Kick-off & Setup](./scrum-days/day-0.md)
- [Day 1 – Event Streaming Core Setup](./scrum-days/day-1.md) *(in progress)*

---

## 🗺️ Roadmap
- **Sprint 1 (3 days)**:  
  - Deploy Kafka in KRaft mode on Kubernetes  
  - Spring Boot Producer on `MyTopic#1`  
  - Spring Boot Consumer + Ollama/Phi-3 API  
  - JUnit/Mockito tests  
  - Documentation

- **Sprint 2**:  
  - React.js interface  
  - Demo features (login, advanced Java functions)  
  - Architectural extensions (Spring Cloud, resilience, etc.)

---

## 🛠️ Tech Stack
- **Backend:** Java 21, Spring Boot 3.5.4
- **Streaming:** Apache Kafka 4.0.0 (KRaft mode, Kubernetes)
- **AI:** Ollama 0.11.2 with Microsoft Phi-3
- **Testing:** JUnit 5, Mockito, Hamcrest
- **Container:** Docker, Kubernetes
- **Database:** MongoDB / Redis *(to be defined)*
- **UI:** React.js *(Sprint 2)*

---

## 📂 Repository Structure
/scrum-days
day-0.md
day-1.md
src/...
README.md

---

## 📌 Notes
- All activities follow the Scrum framework in mini-sprints.  
- Each day is documented with goals, tasks, open issues, and outputs.  
- The aim is not only technical delivery but also practicing the full Dev → Ops → Delivery cycle.

