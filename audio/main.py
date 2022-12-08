import os

stem = "spleeter separate -p spleeter:2stems "
folder = "-o output2 "
audio_file = "audio_example.mp3"

os.system(stem + folder + audio_file)
