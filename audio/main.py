import os


# stem = "spleeter separate -p spleeter:2stems "
# folder = "-o output2 "
# audio_file = "audio_example.mp3"


def process_audio(command):
    return os.system(command)


process_audio("spleeter separate -p spleeter:2stems -o output2 audio_example.mp3")
