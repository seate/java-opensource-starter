# Commit Lint

- `config/githook/commit-msg`에 commit lint 설정이 정의되어 있습니다. 필요한 경우 수정할 수 있습니다.
- gradle refresh를 하면 자동으로 git hook이 적용됩니다.
- build.gradle에 gradle refresh 시 자동으로 commit lint git hook을 적용하는 설정이 있습니다.
- IDE에서 GUI로 Revert하는 등의 우회로를 사용하면 적용되지 않습니다.

## Commit 규칙

커밋 메시지는 기본적으로 [Angular Commit Convention](https://www.conventionalcommits.org/en/v1.0.0/)을 따릅니다.


```
type(scope)?!?: subject
<blank line>
body?
<blank line>
footer?
```

### Type 규칙

`type`은 다음 중 하나를 선택합니다.

  - `Feat`: 새로운 기능
  - `Fix`: 버그 수정
  - `Docs`: 문서 수정
  - `Style`: 코드 스타일 변경 (코드 변경 없음)
  - `Refactor`: 코드 리팩토링 (버그 수정, 기능 추가 없음)
  - `Perf`: 성능 개선
  - `Test`: 테스트 코드 추가/수정
  - `Chore`: 빌드 프로세스 또는 보조 도구 변경 (소스 코드 변경 없음)
  - `Build`: 빌드 관련 변경
  - `CI`: CI 관련 변경
  - `Revert`: 이전 커밋 되돌리기
  - `Merge`: 브랜치 병합
  - `Init`: 초기 커밋

### Type 규칙 예외

- `Merge`, `Init`, `Revert` 커밋은 Angular convention 규칙에서 제외됩니다.

### scope 규칙

`scope`는 선택 사항으로, 변경된 부분의 범위를 나타냅니다. 예: `feat(api)`, `fix(ui)`

### BREAKING CHANGE 규칙

- `!`는 선택 사항으로, 커밋이 Breaking Change임을 나타냅니다. 이 경우 `footer`에 Breaking Change에 대한 설명을 작성할 수 있습니다.

### subject 규칙

- `subject`는 변경 사항에 대한 간단한 설명으로, `subject`가 포함된 줄을 50자 이내로 작성해야 합니다.

### body 규칙

- `body`는 선택 사항으로, 변경 사항에 대한 자세한 설명을 작성합니다. 72자 이내로 작성해야 합니다.

### footer 규칙

- `footer`는 선택 사항으로, 이슈 트래커 ID나 Breaking Change 등을 작성합니다. 예: `BREAKING CHANGE: 변경 사항에 대한 설명`


## Commit Lint 비활성화 방법

- `build.gradle`에 설정된 git hook 영역을 제거
- `config/githook/commit-msg` 파일을 삭제