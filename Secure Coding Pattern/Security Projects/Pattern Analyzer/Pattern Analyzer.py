import re

def regex_pattern_validation(pattern, file_path):

    compiled_pattern = re.compile(pattern)
    identified_pattern = []

    for line in open(file_path):
        for match in re.finditer(compiled_pattern, line):
            identified_pattern.append(match.group())

    return identified_pattern

if __name__ == "__main__":
    pattern = input("Enter the pattern: ")
    file_path = input("Enter the file name and path: ")
    print(regex_pattern_validation(pattern, file_path))
