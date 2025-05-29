# Java Opensource Template

<div style="text-align: center;">
  <img
    src="https://img.shields.io/badge/Java-007396?style=flat&logo=OpenJDK&logoColor=white"
    alt="Java Badge"
  />
  <img
    src="https://img.shields.io/badge/GitHub%20Actions-2088FF?style=flat&logo=GitHub%20Actions&logoColor=white"
    alt="GitHub Actions Badge"
  />
  <a>
    <img
      src="https://img.shields.io/badge/semantic--release-angular-e10079?logo=semantic-release"
      alt="semantic-release-angular"
    />
  </a>
  <a href="https://opensource.org/licenses/MIT">
    <img
      src="https://img.shields.io/badge/License-MIT-green.svg"
      alt="License: MIT"
    />
  </a>
</div>

이 프로젝트는 자바 오픈소스 프로젝트를 시작할 때 사용할 수 있는 템플릿 프로젝트입니다. 오픈소스에 필요한 여러 가지 기능들을 구현해 놓았습니다. 이 프로젝트를 사용하면 오픈소스 프로젝트를 시작할 때 빠르게 시작할 수 있습니다.

---

## Requirements

- Setting Branch Protection Rule

---

## Template

- issue template
- pull request template

`.github` 디렉토리에 issue template과 pull request template을 추가했습니다. 이 템플릿을 사용하면 이슈와 풀 리퀘스트를 작성할 때 템플릿이 자동으로 적용됩니다.


---

## Convention

### Checkstyle

기본적인 컨벤션을 checkstyle로 관리합니다.

- `config/checkstyle` 디렉토리에 checkstyle 설정이 정의되어 있습니다.
- 메인 소스코드에 대한 검사, 테스트 소스코드에 대한 검사, 두 소스코드 모두에 대한 검사로 이루어져 있습니다.
- PR 시 지켜지지 않는 컨벤션이 있다면 CI가 실패하고, PR의 Comment로 어떤 컨벤션이 지켜지지 않았는지 알려줍니다.

```shell
./gradlew check # 전체 컨벤션 테스트
```

<br>

### Commit Lint

commit 규칙을 준수하지 않으면 커밋할 수 없도록 합니다. 

- `config/githook/commit-msg`에 commitlint 설정이 정의되어 있습니다.
- gradle refresh를 하면 자동으로 git hook이 적용됩니다.
- IDE에서 GUI로 커밋하는 등의 우회로를 사용하면 적용되지 않습니다.
- 자세한 내용은 [여기](CommitLint.md)를 참고해주세요.

---

## CI Test

PR 시에 CI Test가 자동으로 실행됩니다.

```shell
./gradlew totalCITest # 전체 CI Test 실행
```

- totalCITest를 실행하면 `totalJavadocTest`, `testCoverage`, `check`가 실행됩니다.


### Test coverage

JacocoTestReport를 사용하여 Test 시에 Test Coverage를 측정합니다.

```shell
./gradlew testCoverage # 테스트 커버리지 검증
```

- `build.gradle`에 jacoco 설정이 정의되어 있습니다.
- CI Test 완료 시 설정한 Test Coverage 기준을 만족하지 않으면 CI가 실패합니다.
- 기본 설정은 LINE Coverage 80% 이상, Branch Coverage 90% 이상입니다.

<br>

### Semantic Release

release 버전을 자동으로 관리합니다.

- commit lint를 사용하여 커밋 메시지에 따라 버전을 자동으로 증가시킵니다.
- release 생성 시 CHANGELOG.md가 자동으로 업데이트됩니다.
- release 생성 시 Relase Note가 자동으로 작성됩니다.
- `./.releaserc.json`과 `.github/semantic_release.yml`에 semantic release 설정이 정의되어 있습니다.
- [Semantic Release Github](https://github.com/semantic-release/semantic-release)에 자세한 내용이 있습니다.

<br>

### Javadoc

Javadoc을 바탕으로 문서를 자동으로 생성합니다.

- Github pages를 사용하면 Javadoc을 호스팅할 수 있습니다.

```shell
./gradlew totalJavadocTest # 전체 Javadoc Test 실행
```

---

## ETC

### Labeling

이슈와 풀 리퀘스트의 제목에 따라 자동으로 라벨을 부여합니다.

- `.github/labeler.yml`에 제목에 따른 부여할 라벨 설정이 정의되어 있습니다.
- `.github/workflows/auto_labeler.yml`에 라벨링 워크플로우가 정의되어 있습니다.
- [Labeler Action](https://github.com/jimschubert/labeler-action)에 자세한 내용이 있습니다.

---