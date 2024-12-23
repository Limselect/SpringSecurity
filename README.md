# Security는 무엇이고 왜 필요할까?

## Security?
시큐리티란 웹앱어플리케이션에서 데이터나 비즈니스 로직을 보호하기 위해 존재한다.

## Security is a non fnc req(비기능적 요구사항)
시큐리티는 가용성, 성능, 확장성적인 측면에서 매우 중요하다,

어떤 클라이언트도 구체적으로 자신은 보안이 좋은 웹앱을 선호한다고 말하지 않는다.

(중요하게 생각하나, 차마 요구사항에 빠지는 일이 부지기수라는 뜻?)

## Security from dev phase
보안은 개발이 완료될 즈음이나 테스트 단계에서 추가하는 것이 아닌 개발 단계서부터 신경써야한다.

보안을 더 빨리 신경쓰면 더 좋은 웹앱에플리케이션을 구축할 수 있다. (SDLC의 왼쪽으로 이동한다.)

## Different types of security
보안에는 다양한 방법이 있다, 방화벽 http 프로토콜, SSL 인증서, 인증, 인가 등 다양한 측면이 있다

## Why security important
데이터를 잃는다는 것은 막대한 비용을 잃는다는 것

## Avoiding most common attacks
CSRF 공격, 세션 고정 공격, 크로스 사이트스크립팅, CORS와 같은 가장 일반적인 공격을 피하는 것도 신경써야한다.

Spring security는 가장 일반적인 해킹으로부터 웹앱을 보호해줄 것.

## Typical security measures for an app

> Cloud Environment
> > Handle DDoS Attack, Firewalls
> 
> Virtual Machines
> > Secure Access, Network Security
> 
> Operating System
> > Regular Updates and Patching, Antivirus & Malware protection
> 
> Containers
> > Use Trusted Images, Minimize Attack Surface, Implement Conainer Isolation
> 
> Web/App Server
> > Regular Security Updates, Access Control, Web Application Firewall(WAF)
> 
> Web Apps/Services
> > Authentication, Authorization, Protection from exploits like CSRF, CORS etc.
> >
> > 이 부분이 개발자의 책임이 되는 영역이므로 보안에 주의를 기울일 필요가 있다.


