# 📅 Daily Timesheet – Spring + Kafka + Microsoft Phi AI Demo Project
**Scrum Framework** – Day 2 (Client: Non-disclosed – Corporate Stakeholder)

## Narrative Context
**2 – Continuation & Backlog Realignment**  
Work carries over from Day 1, as the team did not reach the full Definition of Done on the environment setup.  
**Objective of the day**: unblock and complete **Environment Setup**, run first **Hello World tests** with Kafka topics, clean up old Kubernetes/Docker artifacts, and prepare for integration tasks with Microsoft Phi AI.  

In Scrum, we do not make “fortune-teller” predictions — we adapt.  
When a task slips, it’s moved into the current Sprint backlog, re-prioritized according to impact, and executed with the aim of delivering an **increment** that’s still valuable to the Stakeholder.  
The focus is on transparency: everyone knows what remains, why it’s important, and what “Done” looks like.

---

| Time              | Activity                                               | Notes / Scrum Context                                                                                                                                                                                                |
| ----------------- | ------------------------------------------------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **09:00 – 09:15** | 👋 Team Sync-up & Backlog Grooming                      | Reviewed Day 1 carry-overs: Kafka broker installation, Hello World topic test, environment cleanup. Reconfirmed Sprint Goal.                                                                                         |
| **09:15 – 11:00** | 🧹 Environment Cleanup                                 | Removed stale Docker images, purged unused Kubernetes namespaces. Ensured cluster is clean for fresh deployments.                                                                                                   |
| **11:00 – 13:00** | ⚙️ Kafka Installation & Configuration                   | Installed Kafka locally, created initial topics. Verified broker health. Documented connection parameters for Spring Boot services.                                                                                 |
| **13:00 – 14:00** | 🍽 Lunch Break                                         | Short team disconnect.                                                                                                                                                                                               |
| **14:00 – 15:30** | 💻 Hello World Event Producer in Spring Boot            | Bootstrapped simple Producer app to send messages to Kafka. Encountered minor serialization config issue — fixed inline.                                                                                             |
| **15:30 – 16:30** | 🧪 Consumer Smoke Test                                 | Created minimal Consumer to verify topic subscription. Confirmed end-to-end flow works locally.                                                                                                                      |
| **16:30 – 17:30** | 🔄 Istio Exploration                                   | Investigated Istio mesh install for service-to-service observability. Decided to defer full mesh setup to avoid Sprint scope creep.                                                                                  |
| **17:30 – 18:00** | 📝 Sprint Review Prep & Commit                         | Updated Jira/Trello tasks, committed code to repo, tagged Kafka setup as “Ready for Use.”                                                                                                                             |

---

## 📌 Sprint & Scrum Notes
- **Sprint Goal Alignment**: Now on track — Kafka environment up, Producer & Consumer prototypes verified.
- **Definition of Done Check**: Environment & messaging flow operational; Istio postponed to next iteration.
- **Blockers / Critical Issues**: None major; serialization bug resolved.
- **Backlog Grooming Outcome**: Move AI Consumer integration to Day 3.
- **Stakeholder Communication**: Daily summary sent to client.

---

## 🧠 Lessons Learned
- Never underestimate cleanup time — technical debt removal is key to stability.
- Resist scope creep (e.g., Istio) until core functionality is stable.

---

## 🚀 Next Steps
- Harden Producer & Consumer for production scenarios.
- Begin Microsoft Phi AI Consumer integration.
- Add observability metrics to Kafka topics.
