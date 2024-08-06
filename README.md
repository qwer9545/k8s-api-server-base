# k8s-api-server-base

1. 프로젝트 개요
API Server in k8s + 테라폼 사용해서 인프라 구성_DB CRUD 및 헬스체크 구현
(Java Springboot 기반 mysql CRUD가 가능한 API Server를 Minikube와 Helm chart로 일부(프로메테우스 모니터링) 구성

2. 인프라 구성 및 설정 방법: Terraform/Ansible
3. 인프라 구성도(draw.io)

   ![인프라 구성도](https://github.com/user-attachments/assets/1eee93a5-5df0-4665-ac87-4985288d0e6b)

4. 목표 배포 과정
   - 로컬 시스템에 minikube 설치
   - 사용자가 api-server와 terraform/ansible 레포지토리 클론
   - terraform이 쿠버네티스 클러스터에 필요한 인프라 구성
   - ansible playbook으로 로컬 dest 설정
   - api-server에서 helm-chart를 사용하여 minikube 클러스터에 배포
   - kubectl get pods로 클러스터 배포 확인
