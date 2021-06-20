# Codility Challenge: Zirconium 2019

## DreamTeam

- Difficulty: Medium
- Divide developers into two teams to maximize their total contribution.
- <https://app.codility.com/programmers/challenges/zirconium2019/>
- <https://app.codility.com/programmers/task/dream_team/>

## Versions

- Result
  - `Good`: Correctness 100%, Performance 100%.
  - `OK`: Correctness 100%, Performance <100%.
  - `Fail`: Correctness <100%, Performance <100%.
  - `Timeout`: Correctness <100%, Performance <100%, correctness caused by timeout.
- File naming convention
  - Code `A`: `Zirconium2019A.java`
  - etc

| File | Complexity              | Description    | Result    | Report                                                                  |
| ---- | ----------------------- | -------------- | --------- | ----------------------------------------------------------------------- |
| `A`  | N/A                     | using `stream` | `Timeout` | [XH7NU2-M3X](https://app.codility.com/demo/results/trainingXH7NU2-M3X/) |
| `B`  | `O(N*log(N))` or `O(N)` | using `for`    | `Good`    | [TMTBX4-X8H](https://app.codility.com/demo/results/trainingTMTBX4-X8H/) |

## Observations

- Apparently, `stream` is slow.
