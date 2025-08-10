
# Spring-Kafka-Phi3 AI Demo Project

**Description:**  
An integrated demo using **Spring Boot**, **Apache Kafka**, and **Microsoft Phi-3** (via Ollama) for real-time event processing, following the **Scrum** framework for project management.

---

## 🎯 Goal
Build an end-to-end pipeline:  
Spring Boot Producer → Kafka Topic → Spring Boot Consumer → AI Phi-3 → Processed Response.

---

# 📅 Project Journal

Welcome to the **Sprint Log** — a day-by-day record of our Scrum-based project journey.  
Each entry contains:
- 🎯 Goals and daily objectives
- 📊 Progress tracking
- 🔄 Retrospectives

All daily logs are stored in the 📂 [`/scrum-days`](./scrum-days) folder.

## 📌 How to Read This Journal (Scrum 101)
This log follows a **Scrum-based daily structure**:
1. **Stand-up meeting** – Morning sync to align priorities and identify blockers.  
2. **Sprint goal tracking** – Ensuring each day contributes to the current sprint’s objectives.  
3. **Backlog grooming** – Refining and prioritizing tasks as new information emerges.  
4. **Retrospective notes** – Lessons learned and action points for improvement.

If you are **not familiar with Scrum**, think of it as a lightweight project management framework that:
- Works in short cycles (*sprints*, usually 1–2 weeks)
- Focuses on delivering small, valuable increments
- Encourages continuous feedback and adaptability

---

## 🚦 Daily Logs
- 👋 [Day 0 – Kick-off & Setup](./scrum-days/day-0.md) *(2025-08-09)*
- 📄 [Day X – Scrum Template](./scrum-days/day-X.md)
- 🚀 [Day 1 – Event Streaming Core Setup](./scrum-days/day-1.md) *(in progress, 2025-08-10)*
- 📈 [Day 2 – Sprint Planning & Backlog Alignment](./scrum-days/day-2.md) *(scheduled 2025-08-11)*

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

